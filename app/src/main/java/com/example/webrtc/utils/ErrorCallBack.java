package com.example.webrtc.utils;

/**
 * ErrorCallBack arayüzü, hata durumlarını geri bildirim olarak iletmek için kullanılır.
 */
public interface ErrorCallBack {

    /**
     * Hata durumunda çağrılır.
     * Bu metod, hata oluştuğunda ilgili işlemleri gerçekleştirmek için kullanılabilir.
     */
    void onError();
}
