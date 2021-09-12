package defpackage;

/* renamed from: cpu reason: default package */
/* compiled from: PG */
public final class cpu extends Fragment implements defpackage.nb {
    public defpackage.cpw a;
    private android.widget.ArrayAdapter b;

    public final void a(android.content.Context context) {
        super.a(context);
        Fragment lcVar = this.y;
        if (lcVar instanceof defpackage.cpw) {
            this.a = (defpackage.cpw) lcVar;
            return;
        }
        FragmentActivity j = getActivity();
        if (j instanceof defpackage.cpw) {
            this.a = (defpackage.cpw) j;
        }
    }

    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(2131034180, viewGroup, false);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity j = getActivity();
        this.b = new android.widget.ArrayAdapter(j, 2131034177, 2131755303, new java.util.ArrayList());
        defpackage.na.a(j).a(54321, this);
        android.widget.ListView listView = (android.widget.ListView) view.findViewById(2131755307);
        listView.setAdapter(this.b);
        listView.setOnItemClickListener(new defpackage.cpv(this));
    }

    public final void onDestroy() {
        super.onDestroy();
        defpackage.na.a(getActivity()).a();
    }

    public final defpackage.oc i_() {
        android.os.Bundle bundle = this.i;
        if (bundle == null || bundle.getStringArrayList("pluginLicensePaths") == null || bundle.getStringArrayList("pluginLicensePaths").isEmpty()) {
            return new defpackage.cpt(getActivity());
        }
        return new defpackage.cpt(getActivity(), bundle.getStringArrayList("pluginLicensePaths"));
    }

    public final void j_() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        this.b.clear();
        this.b.addAll(list);
        this.b.notifyDataSetChanged();
    }
}
