package defpackage;

/* renamed from: zt reason: default package */
/* compiled from: PG */
public interface MenuPresenter {
    void a(android.content.Context context, MenuBuilder zeVar);

    void a(android.os.Parcelable parcelable);

    void onCloseMenu(MenuBuilder zeVar, boolean z);

    void setCallback(MenuPresenter_Callback zuVar);

    void a(boolean z);

    boolean flagActionItems();

    boolean onSubMenuSelected(SubMenuBuilder aad);

    boolean a(MenuItemImpl ziVar);

    int getId();

    boolean b(MenuItemImpl ziVar);

    android.os.Parcelable c();
}
