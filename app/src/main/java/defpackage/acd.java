package defpackage;

/* renamed from: acd reason: default package */
/* compiled from: PG */
final class acd implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    private android.widget.SpinnerAdapter a;
    private android.widget.ListAdapter b;

    public acd(android.widget.SpinnerAdapter spinnerAdapter, android.content.res.Resources.Theme theme) {
        this.a = spinnerAdapter;
        if (spinnerAdapter instanceof android.widget.ListAdapter) {
            this.b = (android.widget.ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter)) {
            android.widget.ThemedSpinnerAdapter themedSpinnerAdapter = (android.widget.ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        } else if (spinnerAdapter instanceof defpackage.ags) {
            defpackage.ags ags = (defpackage.ags) spinnerAdapter;
            if (ags.b() == null) {
                ags.a();
            }
        }
    }

    public final int getCount() {
        if (this.a == null) {
            return 0;
        }
        return this.a.getCount();
    }

    public final java.lang.Object getItem(int i) {
        if (this.a == null) {
            return null;
        }
        return this.a.getItem(i);
    }

    public final long getItemId(int i) {
        if (this.a == null) {
            return -1;
        }
        return this.a.getItemId(i);
    }

    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final android.view.View getDropDownView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.a == null) {
            return null;
        }
        return this.a.getDropDownView(i, view, viewGroup);
    }

    public final boolean hasStableIds() {
        return this.a != null && this.a.hasStableIds();
    }

    public final void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        if (this.a != null) {
            this.a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public final boolean areAllItemsEnabled() {
        android.widget.ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final boolean isEnabled(int i) {
        android.widget.ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
