package com.caryguan.taunt;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @Author GuanCary
 * @Date 2020/7/7 16:31
 * @Version 1.0
 **/
public class TauntDialog extends DialogWrapper {
    private JLabel label;

    protected TauntDialog() {
        super(true);
        setTitle("每天一碗毒鸡汤");
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel panel = new JPanel();
        label = new JLabel(ContentUtil.getContent());
        panel.add(label);
        return panel;
    }

    @Override
    protected JComponent createSouthPanel() {
        JPanel panel = new JPanel();
        JButton button = new JButton("再干一碗");
        //每次点击后,都会产生一个新请求
        button.addActionListener(e -> {
            String content = ContentUtil.getContent();
            label.setText(content);
        });
        panel.add(button);
        return panel;
    }
}