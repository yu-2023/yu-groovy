
/**
 *
 * Groovy package     lv.yu.gro.exit
 *
 * Groovy program     GRO_exit_menu_exit_10.groovy     Apache License 2.0
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
 * GRO_exit_menu_exit_10
 */
public class GRO_exit_menu_exit_10_class {

/**
 * GRO_exit_menu_exit_10()
 */
    public GRO_exit_menu_exit_10_class() {

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

        lv.yu.gro.GRO_10_tabs_class.menubar.add(menu_Exit)

//------------------------------

    }  //  end GRO_exit_menu_exit_10_class()

}  //  end GRO_exit_menu_exit_10_class

//------------------------------
