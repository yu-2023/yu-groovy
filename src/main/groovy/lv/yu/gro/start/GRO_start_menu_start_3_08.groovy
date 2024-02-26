
/**
 *
 * Groovy package     lv.yu.gro.start
 *
 * Groovy program     GRO_start_menu_start_3_08.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                      mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start

import javax.swing.JMenu
import javax.swing.JMenuItem

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.KeyEvent

/**
 * GRO_start_menu_start_3_08
 */
public class GRO_start_menu_start_3_08_class {

/**
 * GRO_start_menu_start_3_08()
 */
    public GRO_start_menu_start_3_08_class() {

        var menu_Start_3 = new JMenu("Start3")
            menu_Start_3.setMnemonic(KeyEvent.VK_3)  //  Alt 3
            menu_Start_3.setToolTipText("Start3 commands")

        var menuitem_St31 = new JMenuItem("St31")
            menuitem_St31.setToolTipText("St31 application")
            menuitem_St31.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Start_3.add(menuitem_St31)

        var menuitem_St32 = new JMenuItem("St32")
            menuitem_St32.setToolTipText("St32 application")
            menuitem_St32.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )
            menu_Start_3.add(menuitem_St32)

            lv.yu.gro.GRO_08_internal_frames_class.menubar.add(menu_Start_3)

    }  //  end GRO_start_menu_start_3_08_class()

}  //  end GRO_start_menu_start_3_08_class
