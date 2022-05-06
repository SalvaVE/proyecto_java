
public class Area  {

    String nombre;
    int CArea, CEmpleado, NEdificio;

    public Area() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCArea() {
        return CArea;
    }

    public void setCArea(int CArea) {
        this.CArea = CArea;
    }

    public int getCEmpleado() {
        return CEmpleado;
    }

    public void setCEmpleado(int CEmpleado) {
        this.CEmpleado = CEmpleado;
    }

    public int getNEdificio() {
        return NEdificio;
    }

    public void setNEdificio(int NEdificio) {
        this.NEdificio = NEdificio;
    }
String DatosA (){
  String  Inf = "";
  Inf +="El codigo de Area es:" + CArea  +"\n";
  Inf +="El nombre del Area es:" + nombre +"\n";
  Inf +="La cantidad de empleados es:" + CEmpleado +"\n";
  Inf +="La cantidad de edificios es: " + NEdificio +"\n";
  return Inf;
}

    
}
