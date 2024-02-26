
/**
 *
 * Groovy package     lv.yu.gro.help.help_23
 *
 * Groovy program     GRO_help_23_help_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help.help_23

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

/**
 * GRO_help_23_help_10
 */
public class GRO_help_23_help_10_class {

/**
 * GRO_help_23_help_10()
 */
    public GRO_help_23_help_10_class() {

    var imageicon = new ImageIcon(GRO_help_23_help_10_class.class.getResource("/lv/yu/gro/GRO_resources/info.gif"))

    var jtextarea = new JTextArea()
        jtextarea.setText("GRO_help_23_help_10_JTextArea")

        GRO_help_23_10_class.JTabbedPane_help_23.addTab("help", imageicon, jtextarea, "Load help JTextArea")
        GRO_help_23_10_class.JTabbedPane_help_23.setMnemonicAt(1, KeyEvent.VK_H)  //  Alt H

    }  //  end GRO_help_23_help_10_class()

}  //  end GRO_help_23_help_10_class
