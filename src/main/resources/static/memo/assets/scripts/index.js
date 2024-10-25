const $memoForm = document.getElementById('memoForm');

$memoForm.onsubmit = (e) => {
    e.preventDefault();
    if ($memoForm['writer'].value === '') {
        alert('작성자를 입력해 주세요.');
        return;
    }
    if ($memoForm['content'].value === '') {
        alert('내용을 입력해 주세요.');
        return;
    }
    const xhr = new XMLHttpRequest();
    const formData = new FormData();
    formData.append('writer', $memoForm['writer'].value);
    formData.append('content', $memoForm['content'].value);
    xhr.onreadystatechange = () => {
        if (xhr.readyState !== XMLHttpRequest.DONE) {
            return;
        }
        if (xhr.status < 200 || xhr.status >= 300) {
            alert(`메모를 작성하지 못했습니다. 잠시 후 다시 시도해 주세요. (${xhr.status})`)
            return;
        }
        $memoForm['writer'].value = xhr.responseText;
        // TODO 메모 다시 불러오기
    }
    xhr.open('POST', location.href)
    xhr.send(formData);
    $memoForm['content'].value = " ";
};