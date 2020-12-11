package id.ac.amikom.appmanga.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006 "}, d2 = {"Lid/ac/amikom/appmanga/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lid/ac/amikom/appmanga/data/repository/AuthRepository;", "(Lid/ac/amikom/appmanga/data/repository/AuthRepository;)V", "authLogin", "Landroidx/lifecycle/MutableLiveData;", "Lid/ac/amikom/appmanga/data/model/ActionState;", "Lid/ac/amikom/appmanga/data/model/AuthUser;", "getAuthLogin", "()Landroidx/lifecycle/MutableLiveData;", "authLogout", "", "getAuthLogout", "authRegister", "getAuthRegister", "authUser", "getAuthUser", "email", "", "getEmail", "fullname", "getFullname", "isLogin", "password", "getPassword", "getRepo", "()Lid/ac/amikom/appmanga/data/repository/AuthRepository;", "login", "", "logout", "register", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.AuthUser> authUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.ActionState<id.ac.amikom.appmanga.data.model.AuthUser>> authLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.ActionState<id.ac.amikom.appmanga.data.model.AuthUser>> authRegister = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.ActionState<java.lang.Boolean>> authLogout = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> email = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> fullname = null;
    @org.jetbrains.annotations.NotNull()
    private final id.ac.amikom.appmanga.data.repository.AuthRepository repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.AuthUser> getAuthUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.ActionState<id.ac.amikom.appmanga.data.model.AuthUser>> getAuthLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.ActionState<id.ac.amikom.appmanga.data.model.AuthUser>> getAuthRegister() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.ActionState<java.lang.Boolean>> getAuthLogout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFullname() {
        return null;
    }
    
    public final void login() {
    }
    
    public final void register() {
    }
    
    public final void logout() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final id.ac.amikom.appmanga.data.repository.AuthRepository getRepo() {
        return null;
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    id.ac.amikom.appmanga.data.repository.AuthRepository repo) {
        super();
    }
}