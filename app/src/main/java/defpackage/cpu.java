package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cpu  reason: default package */
/* compiled from: PG */
public final class cpu extends lc implements nb {
    public cpw a;
    private ArrayAdapter b;

    @Override // defpackage.lc
    public final void a(Context context) {
        super.a(context);
        lc lcVar = this.y;
        if (lcVar instanceof cpw) {
            this.a = (cpw) lcVar;
            return;
        }
        lg j = j();
        if (j instanceof cpw) {
            this.a = (cpw) j;
        }
    }

    @Override // defpackage.lc
    public final void d() {
        super.d();
        this.a = null;
    }

    @Override // defpackage.lc
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // defpackage.lc
    public final void a(View view, Bundle bundle) {
        super.a(view, bundle);
        lg j = j();
        this.b = new ArrayAdapter(j, (int) R.layout.libraries_social_licenses_license, (int) R.id.license, new ArrayList());
        na.a(j).a(54321, this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter((ListAdapter) this.b);
        listView.setOnItemClickListener(new cpv(this));
    }

    @Override // defpackage.lc
    public final void u() {
        super.u();
        na.a(j()).a();
    }

    @Override // defpackage.nb
    public final oc i_() {
        Bundle bundle = this.i;
        if (bundle == null || bundle.getStringArrayList("pluginLicensePaths") == null || bundle.getStringArrayList("pluginLicensePaths").isEmpty()) {
            return new cpt(j());
        }
        return new cpt(j(), bundle.getStringArrayList("pluginLicensePaths"));
    }

    @Override // defpackage.nb
    public final void j_() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // defpackage.nb
    public final /* synthetic */ void a(Object obj) {
        this.b.clear();
        this.b.addAll((List) obj);
        this.b.notifyDataSetChanged();
    }
}
