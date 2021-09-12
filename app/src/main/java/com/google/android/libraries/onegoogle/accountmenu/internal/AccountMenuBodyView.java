package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.LayoutInflater;

import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class AccountMenuBodyView extends android.widget.FrameLayout {
    public final android.support.v7.widget.RecyclerView accountListView;
    public final android.view.View dividerView;
    public final android.view.View accountView;
    public defpackage.cdj d;

    public AccountMenuBodyView(android.content.Context context) {
        this(context, null);
    }

    public AccountMenuBodyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.account_menu_body, this, true);
        this.dividerView = findViewById(R.id.divider);
        this.accountView = findViewById(R.id.my_account);
        this.accountListView = findViewById(R.id.accounts_list);
    }
}
