package id.rdev.Luqman180900756C.activity.login

import id.rdev.Luqman180900756C.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}