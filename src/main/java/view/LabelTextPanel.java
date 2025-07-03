package view;

import javax.swing.*;
import java.awt.*;

/**
 * A panel containing a label and a text field.
 */
class LabelTextPanel extends JPanel {
    LabelTextPanel(JLabel label, JTextField textField) {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        label.setFont(new Font("Georgia", Font.PLAIN, 18));
        textField.setFont(label.getFont());

        label.setForeground(Color.WHITE);

        this.add(label);
        this.add(textField);
        this.setBackground(new Color(42, 99, 39));

        this.setMaximumSize(new Dimension(200, 50));
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
