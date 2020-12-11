package id.ac.amikom.appmanga.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\"\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lid/ac/amikom/appmanga/data/local/AuthPref;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "value", "Lid/ac/amikom/appmanga/data/model/AuthUser;", "authUser", "getAuthUser", "()Lid/ac/amikom/appmanga/data/model/AuthUser;", "setAuthUser", "(Lid/ac/amikom/appmanga/data/model/AuthUser;)V", "getContext", "()Landroid/content/Context;", "", "isLogin", "()Z", "setLogin", "(Z)V", "sp", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "sp$delegate", "Lkotlin/Lazy;", "login", "Lid/ac/amikom/appmanga/data/model/ActionState;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "user", "(Lid/ac/amikom/appmanga/data/model/AuthUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class AuthPref {
    private final kotlin.Lazy sp$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_USER = "auth_user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_LOGIN = "is_login";
    @org.jetbrains.annotations.NotNull()
    private static final id.ac.amikom.appmanga.data.local.AuthPref.Companion Companion = null;
    
    private final android.content.SharedPreferences getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final id.ac.amikom.appmanga.data.model.AuthUser getAuthUser() {
        return null;
    }
    
    private final void setAuthUser(id.ac.amikom.appmanga.data.model.AuthUser value) {
    }
    
    public final boolean isLogin() {
        return false;
    }
    
    private final void setLogin(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super id.ac.amikom.appmanga.data.model.ActionState<id.ac.amikom.appmanga.data.model.AuthUser>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object register(@org.jetbrains.annotations.NotNull()
    id.ac.amikom.appmanga.data.model.AuthUser user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super id.ac.amikom.appmanga.data.model.ActionState<id.ac.amikom.appmanga.data.model.AuthUser>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super id.ac.amikom.appmanga.data.model.ActionState<java.lang.Boolean>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public AuthPref(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lid/ac/amikom/appmanga/data/local/AuthPref$Companion;", "", "()V", "AUTH_USER", "", "IS_LOGIN", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}