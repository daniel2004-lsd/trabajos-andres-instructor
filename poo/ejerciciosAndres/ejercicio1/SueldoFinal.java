    package ejerciciosAndres.ejercicio1;
    import java.text.NumberFormat;
    import java.util.Locale;


    public class SueldoFinal {

        
        private static final double SUBSIDIO_TRASPORTE = 140000;
        private static final double SALARIO_MINIMO = 1420000;

        public static double getSubsidioTrasporte() {
            return SUBSIDIO_TRASPORTE;
        }

        public static double getSalarioMinimo() {
            return SALARIO_MINIMO;
        }

        public void calcularTotal(Persona persona, Descuentos descuentos, Estras extras){

            // Formato para valores monetarios con punto de miles
            Locale colombia = new Locale("es", "CO"); // Español de Colombia
            NumberFormat formato = NumberFormat.getInstance(colombia);
            double sueldoBase = persona.calcularSueldo();

            double salud = descuentos.calcularSalud(sueldoBase);
            double pension = descuentos.calcularPension(sueldoBase);
            double arl = descuentos.calcularArl(sueldoBase);
            
            double pagoHorasExtra = extras.calcularPagoHorasExtra();


            double totalDescuentos = salud + pension + arl;
            double sueldoTotal = sueldoBase - totalDescuentos + pagoHorasExtra;

            if (sueldoBase <= 2 * SALARIO_MINIMO) {
                sueldoTotal = sueldoTotal + SUBSIDIO_TRASPORTE;
                System.out.println("subcidio de trasporte:  $ " + formato.format(SUBSIDIO_TRASPORTE));
            }
            else{
                System.out.println("No recibe auxilio de trasporte");
            }

            System.out.println("Empleado : " + persona.getName());
            System.out.println("Sueldo : " + formato.format(sueldoBase));
            System.out.println("Salud : " + formato.format(salud));
            System.out.println("Pension " + formato.format(pension));
            System.out.println("Arl " + formato.format(arl));
            System.out.println("Pago por horas extra : " + formato.format(pagoHorasExtra));
            System.out.println("Total a pagar " + formato.format(sueldoTotal));


        }

    }
