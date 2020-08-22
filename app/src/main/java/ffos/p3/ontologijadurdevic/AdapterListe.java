package ffos.p3.ontologijadurdevic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Ontologija> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // Podatke proslijedimo kroz konstruktor
    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    // napuni predložak red (datoteka red_liste.xml)
    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    // Veže podatke za svaki red
    @Override
    public void onBindViewHolder(Red red, int position) {
        Ontologija o = podaci.get(position);
        red.sifra.setText(String.valueOf(o.getSifra()));
        red.knjiga.setText(o.getKnjiga());
        red.nakladnik.setText(o.getNakladnik());
        red.imaStranica.setText(String.valueOf(o.getImaStranica()));
        red.objavljena.setText(String.valueOf(o.getObjavljena()));
        red.dostupnost.setText(String.valueOf(o.getDostupnost()));
        red.brPosudbi.setText(String.valueOf(o.getBrPosudbi()));
        red.vrijemePosudbe.setText(o.getVrijemePosudbe());
    }

    // Ukupan broj redova (mora biti implementirano)
    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    // Pohranjuje i reciklira pogled kako se prolazi kroz listu
    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView sifra;
        private TextView knjiga;
        private TextView nakladnik;
        private TextView imaStranica;
        private TextView objavljena;
        private TextView dostupnost;
        private TextView brPosudbi;
        private TextView vrijemePosudbe;

        Red(View itemView) {
            super(itemView);
            sifra = itemView.findViewById(R.id.sifra);
            knjiga = itemView.findViewById(R.id.knjiga);
            nakladnik = itemView.findViewById(R.id.nakladnik);
            objavljena = itemView.findViewById(R.id.objavljena);
            imaStranica = itemView.findViewById(R.id.imaStranica);
            dostupnost = itemView.findViewById(R.id.dostupnost);
            brPosudbi = itemView.findViewById(R.id.brPosudbi);
            vrijemePosudbe = itemView.findViewById(R.id.vrijemePosudbe);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // klikom na listu dobijemo samo poziciju koju stavku liste smo odabrali.
    // Ova metoda pomaže da na osnovu pozicije dobijemo cijeli objekt u toj stavci
    public Ontologija getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Ontologija> itemList) {
        this.podaci = itemList;
    }

    // dopusti hvatanje odabira (klik/dotakni)
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // potrebno kako bi mogli hvatati klikove/dodire
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
