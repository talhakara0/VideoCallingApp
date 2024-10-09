package com.example.webrtc.utils;

/**
 * NewEventCallBack arayüzü, yeni bir olay alındığında geri bildirim sağlamak için kullanılır.
 */
public interface NewEventCallBack {

  /**
   * Yeni bir olay alındığında çağrılır.
   *
   * @param model Olay ile ilgili verileri içeren DataModel nesnesi.
   */
  void onNewEventReceived(DataModel model);
}
