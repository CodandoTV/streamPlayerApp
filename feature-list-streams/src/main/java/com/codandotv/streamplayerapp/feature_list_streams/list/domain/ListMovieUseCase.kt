package com.codandotv.streamplayerapp.feature_list_streams.list.domain

import androidx.paging.PagingData
import com.codandotv.streamplayerapp.feature_list_streams.list.data.ListStreamRepository
import com.codandotv.streamplayerapp.feature_list_streams.list.domain.model.Genre
import com.codandotv.streamplayerapp.feature_list_streams.list.domain.model.Stream
import kotlinx.coroutines.flow.Flow
import org.koin.core.annotation.Factory

interface ListStreamUseCase {
    operator fun invoke(genre: Genre): Flow<PagingData<Stream>>
}

@Factory
class ListStreamUseCaseImpl(
    private val repository: ListStreamRepository
) : ListStreamUseCase {
    override operator fun invoke(genre: Genre): Flow<PagingData<Stream>> {
        return repository.loadMovies(genre)
    }
}