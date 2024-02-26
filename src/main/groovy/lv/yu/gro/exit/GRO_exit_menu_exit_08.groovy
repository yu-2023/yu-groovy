
/**
 *
 * Groovy package     lv.yu.gro.exit
 *
 * Groovy program     GRO_exit_menu_exit_08.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.exit

import javax.swing.JMenu
import javax.swing.JMenuItem
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

/**
 * GRO_exit_menu_exit_08
 */
public class GRO_exit_menu_exit_08_class {

/**
 * GRO_exit_menu_exit_08()
 */
    public GRO_exit_menu_exit_08_class() {

//------------------------------

    var icon_Exit = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/exit.png") )

//------------------------------

    var menu_Exit = new JMenu("Exit")
        menu_Exit.setMnemonic(KeyEvent.VK_E)  //  Alt E
        menu_Exit.setToolTipText("Exit commands")
      var item_Exit = new JMenuItem("Exit", icon_Exit)
          item_Exit.setToolTipText("Exit application")

//------------------------------

          item_Exit.addActionListener((event) -> System.exit(0))

//------------------------------

        menu_Exit.add(item_Exit)

        lv.yu.gro.GRO_08_internal_frames_class.menubar.add(menu_Exit)

//------------------------------

    }  //  end GRO_exit_menu_exit_08_class()

}  //  end GRO_exit_menu_exit_08_class

//------------------------------
