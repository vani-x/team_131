// public class Cola {

//     private int ini,fin;
//     private int max=50;
//     private Coordenada[] v;
//     public Cola() {
//         this.ini = 0;
//         this.fin = 0;
//         this.v = new Coordenada[max];
//     }
//     public boolean esVacia() {
//         return ini == fin;
//     }
//     public boolean esLlena() {
//         return fin == max;
//     }
//     public void adicionar(Coordenada c) {
//         if (!esLlena()) {
//             v[fin] = c;
//             fin++;
//         } else {
//             System.out.println("Cola llena");
//         }
//     }
//     public Coordenada eliminar() {
//         if (!esVacia()) {
//             Coordenada c = v[ini];
//             ini++;
//             if (ini == fin) {
//                 ini = 0;
//                 fin = 0;
//             }
//             if (ini == max) {
//                 ini = 0;
//             }
//             return c;
//         } else {
//             System.out.println("Cola vacia");
//             return null;
//         }
//     }
//     public void mostrar() {
//         while (!esVacia()) {
//             Coordenada c = eliminar();
//             if (c != null) {
//                 c.mostrar();
//             }
//         }
//     }
//     public void vaciar(Cola x) {
//         while (!esVacia()) {
//             adicionar(x.eliminar());
//         }
//     }
    
// }