package com.unidade6;

import java.awt.*;
import javax.swing.*;

public class ScrollBar {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Aplicação");
		frame.setSize(350, 250);

		Container container = frame.getContentPane();
		JScrollBar jscrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
		container.add(jscrollBar, BorderLayout.NORTH);

		frame.setVisible(true);

    }
}
