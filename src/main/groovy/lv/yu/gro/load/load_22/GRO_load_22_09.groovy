
/**
 *
 * Groovy package     lv.yu.gro.load.load_22
 *
 * Groovy program     GRO_load_22_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_22

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_load_22_09
 */
public final class GRO_load_22_09_class {

/**
 * JTabbedPane_load_22
 */
    public static JTabbedPane JTabbedPane_load_22 = new JTabbedPane()

/**
 * JInternalFrame_load_22
 */
    public static JInternalFrame JInternalFrame_load_22 = new JInternalFrame()

/**
 * GRO_load_22_09()
 */
    public GRO_load_22_09_class() {

        JTabbedPane_load_22 = new JTabbedPane()
        JTabbedPane_load_22.removeAll()

        JTabbedPane_load_22.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_22.setTabLayoutPolicy(JTabbedPane_load_22.SCROLL_TAB_LAYOUT)

        JInternalFrame_load_22 = new JInternalFrame("22 LOAD LOAD LOAD", true, false, true, true)
        JInternalFrame_load_22.setLayout(new BorderLayout())
        JInternalFrame_load_22.setBackground(Color.GRAY)
        JInternalFrame_load_22.setVisible(true)

        JInternalFrame_load_22.add(JTabbedPane_load_22, BorderLayout.CENTER)

    }  //  end GRO_load_22_09_class()

}  //  end GRO_load_22_09_class
