
/**
 *
 * Groovy package     lv.yu.gro.load.load_23
 *
 * Groovy program     GRO_load_23_help_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_23

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

/**
 * GRO_load_23_help_10
 */
public class GRO_load_23_help_10_class {

/**
 * GRO_load_23_help_10()
 */
    public GRO_load_23_help_10_class() {

    var imageicon = new ImageIcon(GRO_load_23_help_10_class.class.getResource("/lv/yu/gro/GRO_resources/info.gif"))

    var jtextarea = new JTextArea()
        jtextarea.setText("GRO_load_23_help_10_JTextArea")

        GRO_load_23_10_class.JTabbedPane_load_23.addTab("help", imageicon, jtextarea, "Load help JTextArea")
        GRO_load_23_10_class.JTabbedPane_load_23.setMnemonicAt(1, KeyEvent.VK_H)  //  Alt H

    }  //  end GRO_load_23_help_10_class()

}  //  end GRO_load_23_help_10_class
