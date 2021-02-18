package com.example.treinamentokotlincolection

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria()=this.reduce { acc, valor ->  acc * valor}

fun Array<BigDecimal>.media2()=
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria()

fun Array<BigDecimal>.media():BigDecimal{
    if(this.isEmpty()){
        return BigDecimal.ZERO
    }else{
        return this.somatoria() / this.size.toBigDecimal()
    }
}