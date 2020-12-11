package id.ac.amikom.appmanga.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u001d\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lid/ac/amikom/appmanga/data/repository/AuthRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "authPref", "Lid/ac/amikom/appmanga/data/local/AuthPref;", "getAuthPref", "()Lid/ac/amikom/appmanga/data/local/AuthPref;", "authPref$delegate", "Lkotlin/Lazy;", "authUser", "Landroidx/lifecycle/MutableLiveData;", "Lid/ac/amikom/appmanga/data/model/AuthUser;", "getAuthUser", "()Landroidx/lifecycle/MutableLiveData;", "getContext", "()Landroid/content/Context;", "isLogin", "", "login", "Lid/ac/amikom/appmanga/data/model/ActionState;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "user", "(Lid/ac/amikom/appmanga/data/model/AuthUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthRepository {
    private final kotlin.Lazy authPref$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.AuthUser> authUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    private final id.ac.amikom.appmanga.data.local.AuthPref getAuthPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<id.ac.amikom.appmanga.data.model.AuthUser> getAuthUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogin() {
        return null;
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
    
    public AuthRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}