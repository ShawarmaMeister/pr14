import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountryMenu extends JFrame implements ActionListener {
    JComboBox<String> countryComboBox;
    JLabel infoLabel;

    public CountryMenu() {
        setTitle("Выбор страны");
        setSize(300, 200);
        setLayout(new FlowLayout());

        String[] countries = {"Россия", "США", "Китай", "Германия", "Франция"};
        countryComboBox = new JComboBox<>(countries);
        countryComboBox.addActionListener(this);
        add(countryComboBox);

        infoLabel = new JLabel();
        add(infoLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String selectedCountry = (String) countryComboBox.getSelectedItem();
        String info = "";

        switch (selectedCountry) {
            case "Россия":
                info = "Столица: Москва, Язык: Русский";
                break;
            case "США":
                info = "Столица: Вашингтон, Язык: Английский";
                break;
            case "Китай":
                info = "Столица: Пекин, Язык: Китайский";
                break;
            case "Германия":
                info = "Столица: Берлин, Язык: Немецкий";
                break;
            case "Франция":
                info = "Столица: Париж, Язык: Французский";
                break;
        }

        infoLabel.setText(info);
    }

    public static void main(String[] args) {
        new CountryMenu();
    }
}