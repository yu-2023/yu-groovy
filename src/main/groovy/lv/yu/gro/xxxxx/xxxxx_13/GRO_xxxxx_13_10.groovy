
/**
 *
 * Groovy package     lv.yu.gro.xxxxx.xxxxx_13
 *
 * Groovy program     GRO_xxxxx_13_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx.xxxxx_13

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_xxxxx_13_10
 */
public final class GRO_xxxxx_13_10_class {

/**
 * JTabbedPane_xxxxx_13
 */
    public static JTabbedPane JTabbedPane_xxxxx_13 = new JTabbedPane()

/**
 * JInternalFrame_xxxxx_13
 */
    public static JInternalFrame JInternalFrame_xxxxx_13 = new JInternalFrame()

/**
 * GRO_xxxxx_13_10()
 */
    public GRO_xxxxx_13_10_class() {

        JTabbedPane_xxxxx_13 = new JTabbedPane()
        JTabbedPane_xxxxx_13.removeAll()

        def GRO_xxxxx_13_about_10_class = new GRO_xxxxx_13_about_10_class()
        def GRO_xxxxx_13_help_10_class  = new GRO_xxxxx_13_help_10_class()

        JTabbedPane_xxxxx_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_13.setTabLayoutPolicy(JTabbedPane_xxxxx_13.SCROLL_TAB_LAYOUT)

        JInternalFrame_xxxxx_13 = new JInternalFrame("13 XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_13.setLayout(new BorderLayout())
        JInternalFrame_xxxxx_13.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_13.setVisible(true)

        JInternalFrame_xxxxx_13.add(JTabbedPane_xxxxx_13, BorderLayout.CENTER)

    }  //  end GRO_xxxxx_13_10_class()

}  //  end GRO_xxxxx_13_10_class
