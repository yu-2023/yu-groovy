
/**
 *
 * Groovy package     lv.yu.gro.start.start_12
 *
 * Groovy program     GRO_start_12_help_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                 mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start.start_12

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

/**
 * GRO_start_12_help_10
 */
public class GRO_start_12_help_10_class {

/**
 * GRO_start_12_help_10()
 */
    public GRO_start_12_help_10_class() {

    var imageicon = new ImageIcon(GRO_start_12_help_10_class.class.getResource("/lv/yu/gro/GRO_resources/info.gif"))

    var jtextarea = new JTextArea()
        jtextarea.setText("GRO_start_12_help_10_JTextArea")

        GRO_start_12_10_class.JTabbedPane_start_12.addTab("help", imageicon, jtextarea, "Load help JTextArea")
        GRO_start_12_10_class.JTabbedPane_start_12.setMnemonicAt(1, KeyEvent.VK_H)  //  Alt H

    }  //  end GRO_start_12_help_10_class()

}  //  end GRO_start_12_help_10_class
