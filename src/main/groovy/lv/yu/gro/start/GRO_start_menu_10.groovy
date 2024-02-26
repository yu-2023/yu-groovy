
/**
 *
 * Groovy package     lv.yu.gro.start
 *
 * Groovy program     GRO_start_menu_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023              mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start

import javax.swing.JMenuBar
import javax.swing.JMenu

import java.awt.event.KeyEvent

/**
 * GRO_start_menu_10
 */
public class GRO_start_menu_10_class {

/** menu_Menu */
public static JMenu menu_Menu = new JMenu()

/**
 * GRO_start_menu_10
 */
    public GRO_start_menu_10_class() {

        lv.yu.gro.GRO_10_tabs_class.menubar = new JMenuBar()
        lv.yu.gro.GRO_10_tabs_class.menubar.setLayout( new lv.yu.gro.JAV_LIB_wrap_layout(lv.yu.gro.JAV_LIB_wrap_layout.LEFT, 0, 0) )

            menu_Menu = new JMenu("Menu")
            menu_Menu.setMnemonic(KeyEvent.VK_M)  //  Alt M
            menu_Menu.setToolTipText("Menu commands")

            lv.yu.gro.GRO_10_tabs_class.menubar.add(menu_Menu)

    }  //  end GRO_start_menu_10_class()

}  //  end GRO_start_menu_10_class
