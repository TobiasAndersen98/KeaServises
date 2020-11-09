public class ServiceInfo {
    // Her derfinere vi vores atributer vi har bestemt at alle  sevices skal have et navn og et nummer
        private String Navn;
        private int Nummer;

        public int getNummer() { return Nummer;}

        // Nu laver vi en kontrocter, vi siger til progamet at vores atributer og vorse kontrocter skal hænge sammen
        public ServiceInfo (String navn, int nummer)
        {
            Nummer=nummer;
            Navn=navn;
        }
// Her laver vi en Override´af  toString for ikke at give os adrassen i progemet men navnet og nummert som vi har deffineret
        @Override
        public String toString()
        {
            return "Navn: " + Navn ;

        }

}
