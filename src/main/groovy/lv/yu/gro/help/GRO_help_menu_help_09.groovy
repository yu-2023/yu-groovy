
/**
 *
 * Groovy package     lv.yu.gro.help
 *
 * Groovy program     GRO_help_menu_help_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help

import javax.swing.JMenu
import javax.swing.JMenuItem
import javax.swing.ImageIcon

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/**
 * GRO_help_menu_help_09
 */
public class GRO_help_menu_help_09_class {

/**
 * GRO_help_menu_help_09()
 */
    public GRO_help_menu_help_09_class() {

//------------------------------

    var icon_Information = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/information.gif") )
    var icon_Help        = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/help.png") )
    var icon_About       = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/about.gif") )

//------------------------------

    var menu_Help = new JMenu("Help")
        menu_Help.setMnemonic(KeyEvent.VK_H)  //  Alt H
        menu_Help.setToolTipText("Help commands")
      var item_Information = new JMenuItem("Information", icon_Information)
          item_Information.setToolTipText("Information application")
      var item_Help = new JMenuItem("Help", icon_Help)
          item_Help.setToolTipText("Help application")
      var item_About = new JMenuItem("About", icon_About)
          item_About.setToolTipText("About application")

//------------------------------

          item_Information.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )

          item_Help.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { def GRO_help_visualize_09_class = new lv.yu.gro.help.GRO_help_visualize_09_class() } } )

          item_About.addActionListener(new ActionListener() {
           	  public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )

//------------------------------

            menu_Help.add(item_Information)
            menu_Help.add(item_Help)
            menu_Help.add(item_About)

            lv.yu.gro.GRO_09_internal_frames_change_class.menubar.add(menu_Help)

//------------------------------

    }  //  end GRO_help_menu_help_09_class()

}  //  end GRO_help_menu_help_09_class

