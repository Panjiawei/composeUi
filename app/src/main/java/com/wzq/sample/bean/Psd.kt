package com.wzq.sample.bean

class Psd : User {
    var mane: String
    var age = 0

    constructor(mane: String, age: Int) {
        this.mane = mane
        this.age = age
    }

    constructor(mane: String) {
        this.mane = mane
    }
}