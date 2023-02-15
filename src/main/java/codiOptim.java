public class codiOptim {
        /**
         * Main que necessitem per donar valor a edat i nom de les persones
         * @param args
         */
        public static void main(String[] args) {
            persona persona1 = new persona(17, "Jose");
            persona persona2 = new persona(25, "Manu");

            extracted(persona1);
            extracted(persona2);
        }

        /**
         * Mètode que veu si l'edat es major de 18 i ens diu si pot o no pot passar
         * @param auxiliar apunta a les diferents persones que creem
         */
        private static void extracted(persona auxiliar) {
            if(auxiliar.edat >= 18){
                System.out.println(auxiliar.nom+ " pot passar");
            }else{{
                System.out.println(auxiliar.nom+ " no" + " pot passar");
            }}
        }
    }

