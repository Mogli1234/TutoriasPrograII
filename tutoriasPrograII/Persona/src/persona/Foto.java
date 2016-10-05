/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Iso.chan
 */
public class Foto {

    private String pathToFile;
    private String tipoArchivo;
    private String tamanno;

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getTamanno() {
        return tamanno;
    }

    public void setTamanno(String  tamanno) {
        this.tamanno = tamanno;
    }

    @Override
    public String toString() {
        return "Foto{" + "pathToFile=" + pathToFile + ", tipoArchivo=" + tipoArchivo + ", tamanno=" + tamanno + '}';
    }
    
    
}
