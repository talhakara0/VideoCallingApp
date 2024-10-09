package com.example.webrtc.utils;

/**
 * SuccessCallBack arayüzü, başarılı bir işlem gerçekleştirildiğinde geri bildirim sağlamak için kullanılır.
 */
public interface SuccessCallBack {

    /**
     * İşlem başarıyla tamamlandığında çağrılır.
     * Bu metod, başarı durumunda ilgili işlemleri gerçekleştirmek için kullanılabilir.
     */
    void onSuccess();
}
