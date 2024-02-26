
/**
 *
 * Groovy package     lv.yu.gro.load.load_21
 *
 * Groovy program     GRO_load_21_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_21

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_load_21_10
 */
public final class GRO_load_21_10_class {

/**
 * JTabbedPane_load_21
 */
    public static JTabbedPane JTabbedPane_load_21 = new JTabbedPane()

/**
 * JInternalFrame_load_21
 */
    public static JInternalFrame JInternalFrame_load_21 = new JInternalFrame()

/**
 * GRO_load_21_10()
 */
    public GRO_load_21_10_class() {

        JTabbedPane_load_21 = new JTabbedPane()
        JTabbedPane_load_21.removeAll()

        def GRO_load_21_about_10_class = new GRO_load_21_about_10_class()
        def GRO_load_21_help_10_class  = new GRO_load_21_help_10_class()

        JTabbedPane_load_21.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_21.setTabLayoutPolicy(JTabbedPane_load_21.SCROLL_TAB_LAYOUT)

        JInternalFrame_load_21 = new JInternalFrame("21 LOAD", true, false, true, true)
        JInternalFrame_load_21.setLayout(new BorderLayout())
        JInternalFrame_load_21.setBackground(Color.GRAY)
        JInternalFrame_load_21.setVisible(true)

        JInternalFrame_load_21.add(JTabbedPane_load_21, BorderLayout.CENTER)

    }  //  end GRO_load_21_10_class()

}  //  end GRO_load_21_10_class
