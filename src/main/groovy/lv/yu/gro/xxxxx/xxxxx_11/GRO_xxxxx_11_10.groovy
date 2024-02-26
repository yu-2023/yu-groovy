
/**
 *
 * Groovy package     lv.yu.gro.xxxxx.xxxxx_11
 *
 * Groovy program     GRO_xxxxx_11_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx.xxxxx_11

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_xxxxx_11_10
 */
public final class GRO_xxxxx_11_10_class {

/**
 * JTabbedPane_xxxxx_11
 */
    public static JTabbedPane JTabbedPane_xxxxx_11 = new JTabbedPane()

/**
 * JInternalFrame_xxxxx_11
 */
    public static JInternalFrame JInternalFrame_xxxxx_11 = new JInternalFrame()

/**
 * GRO_xxxxx_11_10()
 */
    public GRO_xxxxx_11_10_class() {

        JTabbedPane_xxxxx_11 = new JTabbedPane()
        JTabbedPane_xxxxx_11.removeAll()

        def GRO_xxxxx_11_about_10_class = new GRO_xxxxx_11_about_10_class()
        def GRO_xxxxx_11_help_10_class  = new GRO_xxxxx_11_help_10_class()

        JTabbedPane_xxxxx_11.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_11.setTabLayoutPolicy(JTabbedPane_xxxxx_11.SCROLL_TAB_LAYOUT)

        JInternalFrame_xxxxx_11 = new JInternalFrame("11 XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_11.setLayout(new BorderLayout())
        JInternalFrame_xxxxx_11.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_11.setVisible(true)

        JInternalFrame_xxxxx_11.add(JTabbedPane_xxxxx_11, BorderLayout.CENTER)

    }  //  end GRO_xxxxx_11_10_class()

}  //  end GRO_xxxxx_11_10_class
