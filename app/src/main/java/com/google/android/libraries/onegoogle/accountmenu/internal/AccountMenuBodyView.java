package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;

/* compiled from: PG */
public class AccountMenuBodyView extends FrameLayout {
    public final RecyclerView a;
    public final View b;
    public final View c;
    public cdj d;

    public AccountMenuBodyView(Context context) {
        this(context, null);
    }

    public AccountMenuBodyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.account_menu_body, (ViewGroup) this, true);
        this.b = findViewById(R.id.divider);
        this.c = findViewById(R.id.my_account);
        this.a = (RecyclerView) findViewById(R.id.accounts_list);
    }
}
