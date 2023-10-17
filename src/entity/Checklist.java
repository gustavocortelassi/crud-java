package entity;

public class Checklist {
    private int checklist_id;
    private String titulo;
    private String descricao;

    public int getChecklist_id() {
        return checklist_id;
    }

    public void setChecklist_id(int checklist_id) {
        this.checklist_id = checklist_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
