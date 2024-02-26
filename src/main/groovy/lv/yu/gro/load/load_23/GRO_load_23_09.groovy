
/**
 *
 * Groovy package     lv.yu.gro.load.load_23
 *
 * Groovy program     GRO_load_23_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_23

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_load_23_09
 */
public final class GRO_load_23_09_class {

/**
 * JTabbedPane_load_23
 */
    public static JTabbedPane JTabbedPane_load_23 = new JTabbedPane()

/**
 * JInternalFrame_load_23
 */
    public static JInternalFrame JInternalFrame_load_23 = new JInternalFrame()

/**
 * GRO_load_23_09()
 */
    public GRO_load_23_09_class() {

        JTabbedPane_load_23 = new JTabbedPane()
        JTabbedPane_load_23.removeAll()

        JTabbedPane_load_23.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_23.setTabLayoutPolicy(JTabbedPane_load_23.SCROLL_TAB_LAYOUT)

        JInternalFrame_load_23 = new JInternalFrame("23 LOAD", true, false, true, true)
        JInternalFrame_load_23.setLayout(new BorderLayout())
        JInternalFrame_load_23.setBackground(Color.GRAY)
        JInternalFrame_load_23.setVisible(true)

        JInternalFrame_load_23.add(JTabbedPane_load_23, BorderLayout.CENTER)

    }  //  end GRO_load_23_09_class()

}  //  end GRO_load_23_09_class
