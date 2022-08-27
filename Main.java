public class Main {
        public static void main(String[] args) {
            Coche miCoche = new Coche();
            miCoche.AddPuerta();
            System.out.println(miCoche.puertas);
            var resultado = suma(23,56,87);
            System.out.println(resultado);
        }
       
        public static int suma (int param1, int param2, int param3) {
            int resultado = param1 + param2 + param3;
            return resultado;
        }
        
        static class Coche {
            public int puertas = 3;
            public void AddPuerta() {
               this.puertas++;
            }
        }
    }
    
