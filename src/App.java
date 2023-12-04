/*
 * File: App.java
 * Author: Nagy János
 * Copyright: 2023, Nagy János
 * Refactor: Hajdara Patrik
 * Date: 2023-11-29
 * Licenc: MIT
 * Az esetlegesen elofordulo hibakert nem all modomban felelosseget vallalni
 */

import views.MainWindow;

public class App {

  public static void main(String[] args) throws Exception {
    runApplication();
  }

  private static void runApplication() {
    MainWindow mainWindow = createMainWindow();
    showMainWindow(mainWindow);
  }

  private static MainWindow createMainWindow() {
    return new MainWindow();
  }

  private static void showMainWindow(MainWindow mainWindow) {
    mainWindow.setVisible(true);
  }
}
