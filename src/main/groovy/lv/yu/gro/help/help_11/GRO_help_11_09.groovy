
/**
 *
 * Groovy package     lv.yu.gro.help.help_11
 *
 * Groovy program     GRO_help_11_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help.help_11

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_help_11_09
 */
public final class GRO_help_11_09_class {

/**
 * JTabbedPane_help_11
 */
    public static JTabbedPane JTabbedPane_help_11 = new JTabbedPane()

/**
 * JInternalFrame_help_11
 */
    public static JInternalFrame JInternalFrame_help_11 = new JInternalFrame()

/**
 * GRO_help_11_09()
 */
    public GRO_help_11_09_class() {

        JTabbedPane_help_11 = new JTabbedPane()
        JTabbedPane_help_11.removeAll()

        JTabbedPane_help_11.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_11.setTabLayoutPolicy(JTabbedPane_help_11.SCROLL_TAB_LAYOUT)

        JInternalFrame_help_11 = new JInternalFrame("11 HELP", true, false, true, true)
        JInternalFrame_help_11.setLayout(new BorderLayout())
        JInternalFrame_help_11.setBackground(Color.GRAY)
        JInternalFrame_help_11.setVisible(true)

        JInternalFrame_help_11.add(JTabbedPane_help_11, BorderLayout.CENTER)

    }  //  end GRO_help_11_09_class()

}  //  end GRO_help_11_09_class
