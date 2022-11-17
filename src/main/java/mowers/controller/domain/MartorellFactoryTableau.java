package mowers.controller.domain;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MartorellFactoryTableau implements Tableau{
    private List<Mower> mowers;

    public List<Mower> runInstruction(String instruction){
        return mowers;
    }

    public List<Mower> mowers() {
        return mowers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((mowers == null) ? 0 : mowers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MartorellFactoryTableau other = (MartorellFactoryTableau) obj;
        if (mowers == null) {
            if (other.mowers != null)
                return false;
        } else if (!mowers.equals(other.mowers))
            return false;
        return true;
    }
}
