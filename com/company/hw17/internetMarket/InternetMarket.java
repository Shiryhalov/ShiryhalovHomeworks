package com.company.hw17.internetMarket;

import com.company.MethodsForWork;

import java.util.*;

import static com.company.hw17.internetMarket.BuyingReport.buyingReport;

public class InternetMarket {
    public static void main(String[] args) {
        User user = new User();
        Basket basket = new Basket();
        basket.createBasket();
        PasswordChecker passwordChecker = new PasswordChecker();
        passwordChecker.downloadUsers();
        user = passwordChecker.checkAuthentication("RAQ", "777");
        System.out.println(user);

        Product samsung = new Product("Samsung", 250, 4.3);
        Product apple = new Product("Apple", 400, 4.9);
        Product asus = new Product("Asus", 450, 4.7);
        Product lenovo = new Product("Lenovo", 200, 3.9);

        Product sennheiser = new Product("Sennheiser", 150, 4.9);
        Product akg = new Product("AKG", 120, 4.7);
        Product razer = new Product("Razer", 199, 4.2);

        ProductNameComparator productNameComparator = new ProductNameComparator();

        Set<Product> set1 = new TreeSet<>(productNameComparator);
        set1.add(samsung);
        set1.add(apple);
        set1.add(asus);
        set1.add(lenovo);

        Set<Product> set2 = new TreeSet<>(productNameComparator);
        set2.add(sennheiser);
        set2.add(akg);
        set2.add(razer);

        Category phones = new Category("Phones", set1);
        Category headphones = new Category("Headphones", set2);

        boolean isContinue = true;

        while (isContinue) {
            isContinue = true;
            if (user.getLogin() != null) {
                System.out.printf("%n%s%n", user.getLogin());
            } else {
                System.out.printf("%nГость%n");
            }
            System.out.println("1 - Просмотр списка каталогов");
            System.out.println("2 - Перейти в корзину");
            System.out.println("3 - Загрузить последнюю корзину");
            System.out.println("0 - Выход");
            int b = MethodsForWork.checkInt();
            switch (b) {
                case 1:
                    System.out.println("1 - " + phones.getName());
                    System.out.println("2 - " + headphones.getName());
                    System.out.println("0 - Назад");
                    b = MethodsForWork.checkInt();
                    switch (b) {
                        case 1:
                            System.out.println("Выберите сортировку: ");
                            System.out.println("1 - По имени");
                            System.out.println("2 - По рейтингу");
                            System.out.println("3 - По цене");
                            System.out.println("0 - Назад");
                            b = MethodsForWork.checkInt();
                            switch (b) {
                                case 1:
                                    phones.printNameSort();
                                    break;
                                case 2:
                                    phones.printRatingSort();
                                    break;
                                case 3:
                                    phones.printPriceSort();
                                    break;
                                case 0:
                                    continue;
                                default:
                                    System.out.println("Такого варианта нет");
                            }
                            putIntoBasket(basket, phones);
                            basket.serializable();
                            break;

                        case 2:
                            System.out.println("Выберите сортировку: ");
                            System.out.println("1 - По имени");
                            System.out.println("2 - По рейтингу");
                            System.out.println("3 - По цене");
                            System.out.println("0 - Назад");
                            b = MethodsForWork.checkInt();
                            switch (b) {
                                case 1:
                                    headphones.printNameSort();
                                    break;
                                case 2:
                                    headphones.printRatingSort();
                                    break;
                                case 3:
                                    headphones.printPriceSort();
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("Такого варианта нет");
                            }
                            putIntoBasket(basket, headphones);
                            basket.serializable();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Такого варианта нет");
                    }
                    break;
                case 2:
                    System.out.println("Ваша корзина:");
                    int x = 1;
                    double cost = 0;
                    for (Product i : basket.getProductSet()) {
                        System.out.printf("%s. %-12s %s \n", x, i.getName(), i.getPrice());
                        cost += i.getPrice();
                        x++;
                    }
                    System.out.printf("%15s %s\n", "Итого", cost);
                    if (user.getLogin() != null) {
                        System.out.println("Если вы хотите купить товары из корзины, введите 1, назад - 2");
                        b = MethodsForWork.checkInt();
                        switch (b) {
                            case 1:
                                System.out.println("Для покупки товаров из корзины, подтвердите пароль: ");
                                Scanner sc = new Scanner(System.in);
                                if (sc.hasNext()) {
                                    String pass = sc.nextLine();
                                    if (pass.equals(user.getPassword())) {
                                        buyingReport(basket);
                                        Set<Product> productSet = new HashSet<>();
                                        basket.setProductSet(productSet);
                                        System.out.printf("%s, спасибо за покупку!\n", user.getLogin());
                                    } else {
                                        System.out.println("Проверьте правильность пароля");
                                    }
                                } else {
                                    System.out.println("Попробуйте еще раз");
                                }
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Такого варианта нет");
                        }
                    } else {
                        System.out.println("Если вы хотите купить товары из корзины, введите 1, назад - 2");
                        b = MethodsForWork.checkInt();
                        switch (b) {
                            case 1:
                                buyingReport(basket);
                                Set<Product> productSet = new HashSet<>();
                                basket.setProductSet(productSet);
                                System.out.println("Спасибо за покупку!");
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Такого варианта нет");
                        }
                    }
                    break;
                case 3:
                    basket = basket.deserializable();
                    System.out.println("Корзина загружена!\n");
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Такого варианта нет");
            }
        }
    }

    private static void putIntoBasket(Basket basket, Category phones) {
        System.out.println("Для того, чтобы поместить товар в корзину, введите его Имя(name)");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String product = sc.nextLine();
            if (basket.findProduct(product, phones)) {
                System.out.println("Товар успешно добавлен в корзину!");
            } else {
                System.out.println("Товар не найден.");
            }
        } else {
            System.out.println("Товар не найден.");
        }
    }
}
