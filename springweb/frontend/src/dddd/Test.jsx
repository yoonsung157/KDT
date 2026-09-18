export default function Test({ oncategoryupdated }) {
  const [categories, setCategories] = useState([]);
  const [name, setName] = useState('');

  // 1. 카테고리 전체 조회
  const fetchcategories = async () => {
    try {
      const res = await fetch('http://localhost:8080/test');
      if (res.ok) {
        const data = await res.json();
        const list = Array.isArray(data) ? data : [];
        setCategories(list);
        if (oncategoryupdated) oncategoryupdated(list);
      }
    } catch (err) {
      console.error('카테고리 조회 실패:', err);
    }
  };

  useEffect(() => {
    fetchcategories();
  }, []);
}