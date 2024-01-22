/**
 Copyright 2004 Juan Heyns. All rights reserved.

 Redistribution and use in source and binary forms, with or without modification, are
 permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this list of
 conditions and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright notice, this list
 of conditions and the following disclaimer in the documentation and/or other materials
 provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY JUAN HEYNS ``AS IS'' AND ANY EXPRESS OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL JUAN HEYNS OR
 CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 The views and conclusions contained in the software and documentation are those of the
 authors and should not be interpreted as representing official policies, either expressed
 or implied, of Juan Heyns.
 */
package org.jdatepicker;

import javax.swing.*;
import java.awt.*;

public class TestJDatePicker {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
        }
        final ComponentTextDefaults defaults = ComponentTextDefaults.getInstance();
        var icon = new ImageIcon("D:\\Program Files (x86)\\Tencent\\WeChat\\Files\\WeChat Files\\jianghao08\\FileStorage\\File\\2023-11\\数字一体化手术室切图_20231115\\术后\\手术资料\\手术资料_搜索_手术日期_normal.png");
        ComponentIconDefaults.getInstance().setPopupButtonIcon(icon);
        defaults.setText(ComponentTextDefaults.Key.SUN, "日");
        defaults.setText(ComponentTextDefaults.Key.MON, "一");
        defaults.setText(ComponentTextDefaults.Key.TUE, "二");
        defaults.setText(ComponentTextDefaults.Key.WED, "三");
        defaults.setText(ComponentTextDefaults.Key.THU, "四");
        defaults.setText(ComponentTextDefaults.Key.FRI, "五");
        defaults.setText(ComponentTextDefaults.Key.SAT, "六");
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        testFrame.setSize(800, 700);
        JPanel jPanel = new JPanel(null);
        JDatePicker picker = new JDatePicker(new JDatePickerStringDataModel(), 426, 300, null);
//        picker.setOpaque(false);
        picker.setBorder(null);
        picker.setBounds(100, 50, 156, 27);
        picker.setFont(new Font("宋体", Font.PLAIN, 18));
        picker.setShowYearButtons(true);

        picker.setTextEditable(false);
        picker.setShowYearButtons(false);
//        picker.setTextfieldColumns(105);
        jPanel.add(picker);
        jPanel.setBackground(Color.WHITE);
        testFrame.setLayout(null);
        jPanel.setBounds(0, 0, 800, 600);
        testFrame.getContentPane().add(jPanel);
        testFrame.setVisible(true);
    }

}
