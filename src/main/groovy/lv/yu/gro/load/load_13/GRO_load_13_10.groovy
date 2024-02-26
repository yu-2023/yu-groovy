
/**
 *
 * Groovy package     lv.yu.gro.load.load_13
 *
 * Groovy program     GRO_load_13_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_13

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_load_13_10
 */
public final class GRO_load_13_10_class {

/**
 * JTabbedPane_load_13
 */
    public static JTabbedPane JTabbedPane_load_13 = new JTabbedPane()

/**
 * JInternalFrame_load_13
 */
    public static JInternalFrame JInternalFrame_load_13 = new JInternalFrame()

/**
 * GRO_load_13_10()
 */
    public GRO_load_13_10_class() {

        JTabbedPane_load_13 = new JTabbedPane()
        JTabbedPane_load_13.removeAll()

        def GRO_load_13_about_10_class = new GRO_load_13_about_10_class()
        def GRO_load_13_help_10_class  = new GRO_load_13_help_10_class()

        JTabbedPane_load_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_13.setTabLayoutPolicy(JTabbedPane_load_13.SCROLL_TAB_LAYOUT)

        JInternalFrame_load_13 = new JInternalFrame("13 LOAD", true, false, true, true)
        JInternalFrame_load_13.setLayout(new BorderLayout())
        JInternalFrame_load_13.setBackground(Color.GRAY)
        JInternalFrame_load_13.setVisible(true)

        JInternalFrame_load_13.add(JTabbedPane_load_13, BorderLayout.CENTER)

    }  //  end GRO_load_13_10_class()

}  //  end GRO_load_13_10_class
