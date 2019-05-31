package Interface;

import javax.swing.text.*;

public class JTextFieldLimit2 extends PlainDocument {

    private int limit;

    private boolean toUppercase = false;

    JTextFieldLimit2(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {

            char[] addedFigures = str.toCharArray();
            char c;
            for (int i = addedFigures.length; i > 0; i--) {
                c = addedFigures[i - 1];
                if (Character.isDigit(c) || c == '.') {
                    super.insertString(offs, new String(new Character(c).toString()), a);
                }

            }

        }

    }
}
