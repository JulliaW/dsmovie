import { useParams } from 'react-router-dom';
import FormCard from 'components/FormCard';

function Form() {

    const params = useParams();
    
    return (
        <FormCard movieId={`${params.movieID}`} />
    );

}

export default Form;