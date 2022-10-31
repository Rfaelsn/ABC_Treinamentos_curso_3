package com.aovivo.sisrestaurantedao.enums;
/**
* <h1>MetodPagamento.java</h1>
* <p>
* Este Enum define os métodos de pagamento e seus respectivos descontos.
* </p>
*
* @author Rafael Silva do Nascimento
* @version 1.0
* @since 28-10-2022
*/

public enum MetodPagamento {
    DEBITO(0.02f),CREDITO(0),PIX(0.12f),AVISTA(0.11f);

    float porcentDescont;


    MetodPagamento(float porcentDescont) {
        this.porcentDescont = porcentDescont;
    }


    public float getPorcentDescont() {
        return this.porcentDescont;
    }
}
