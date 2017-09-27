public class Persona {
    private String nombre,apellidoP,apellidoM,sexo;

        public String getNombre() {
            return nombre;
        }
        
        public String getApellidoP() {
            return apellidoP;
        }

        public String getApellidoM() {
            return apellidoM;
        }

        public String getSexo() {
            return sexo;
         }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellidoP(String apellidoP) {
            this.apellidoP = apellidoP;
        }

        public void setApellidoM(String apellidoM) {
            this.apellidoM = apellidoM;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

    @Override
        public String toString() {
            return "Persona{" + "nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", sexo=" + sexo + '}';
        }

    }
